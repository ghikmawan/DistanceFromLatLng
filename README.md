# DistanceFromLatLng
This small Java funcion calculates the distance (in meters) using coordinates of two locations.

Coordinates are passed in as Double-typed values of latitude and longite, and it returns the distance as a Double.

The constant value of earth's radius in meters (R = 6378137), is <a href="http://131.247.211.166/tiki/tiki-index_raw.php?page=Earth+radius">equatorial radius</a>, defined in World Geodetic System 1984 (WGS84).

To calculate the distance, first the function uses <a href="https://en.wikipedia.org/wiki/Haversine_formula">Haversine</a> formula:<br>
<i>a = sin²(Δφ/2) + cos φ1 * cos φ2 * sin²(Δλ/2)<i>

where:<br>
<i>Δφ = (latitude of second coordinate) - (latitude of first coordinate)<br>
<i>φ1 = latitude of first coordinate<br>
<i>φ2 = latitude of second coordinate<br>
<i>Δλ = (longitude of second corrdinate) - (longitude of second coordinate)<br>

Then it uses the formula from <a href="https://www.movable-type.co.uk/scripts/latlong.html">this site</a>:<br>
<i>c = 2 * atan2( √a, √(1−a) )</i><br>
<i>d = R * c</i>

<i>d</i> is the distance that this function returns.
