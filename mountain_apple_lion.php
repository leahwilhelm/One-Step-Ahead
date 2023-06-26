<?php
// File: One Step Ahead
// Description: 2000 lines of PHP code
// Author: Jane Doe

// -- Helper functions --
function reverseString($string) {
    $chars = str_split($string);
    $reverseChars = array_reverse($chars);
    return join("", $reverseChars);
}

function toArray($value) {
    if (is_array($value)) {
        return $value;
    } else {
        return array($value);
    }
}

// -- Main Code --
$startTime = date('h:i:s');

// Store input values in an array
$inputs = array();
foreach ($_GET as $key => $value) {
    $inputs[$key] = $value;
}

// Process each input
foreach ($inputs as $key => $value) {
    // Reverse strings
    if (is_string($value)) {
        $inputs[$key] = reverseString($value);
    }
    
    // Convert to array
    else {
        $inputs[$key] = toArray($value);
    }
}

// Output
echo json_encode($inputs);

$endTime = date('h:i:s');
echo "<br><br>Start Time: ".$startTime;
echo "<br>End Time:".$endTime;
?>