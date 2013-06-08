from setuptools import setup, find_packages
 
setup(
    name = "biointerchange",
    version = "1.0.0",
    author = "Joachim Baran, Kevin B. Cohen, Geraint Duck, Michel Dumontier, Jin-Dong Kim",
    description = ( "Wrapper for easy access to FALDO, GFF3O, GVF1O, SIO, SO and SOFA.",
                    "Part of the BioInterchange project." ),
    license = "MIT",
    url = "http://www.biointerchange.org",
    packages = find_packages()
    )

