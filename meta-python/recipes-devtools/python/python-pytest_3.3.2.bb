inherit pypi setuptools
require python-pytest.inc

RDEPENDS_${PN}_class-target += " \
    ${PYTHON_PN}-compiler \
    ${PYTHON_PN}-funcsigs \
"
