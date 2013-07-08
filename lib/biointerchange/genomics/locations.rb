module BioInterchange::Genomics

class Locations

  def self.reg2bin(region_begin, region_end)
    region_end -= 1
    return ((1 << 15) - 1) / 7 + (region_begin >> 14) if (region_begin >> 14 == region_end >> 14)
    return ((1<<12)-1)/7 + (region_begin >> 17) if (region_begin >> 17 == region_end >> 17)
    return ((1<<9)-1)/7  + (region_begin >> 20) if (region_begin >> 20 == region_end >> 20)
    return ((1<<6)-1)/7  + (region_begin >> 23) if (region_begin >> 23 == region_end >> 23)
    return ((1<<3)-1)/7  + (region_begin >> 26) if (region_begin >> 26 == region_end >> 26)
    return 0
  end

  def self.reg2bins(region_begin, region_end)
    bins = [ 0 ]
    region_end -= 1
    [[26, 1], [23, 9], [20, 73], [17, 585], [14, 4681]].each { |pair|
      power, offset = pair
      ((offset + (region_begin >> power))..(offset + (region_end >> power))).each { |k|
        bins << k
      }
    }
    return bins
  end

end

end

