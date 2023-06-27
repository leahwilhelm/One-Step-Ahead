<?php 
// File: One Step Ahead

// Arrays to store data
$users = array();
$points = array();

// Load the users from a file
$users_file = fopen("users.txt", "r") or die("Unable to open file!");
while(!feof($users_file)) {
    $user_data = fgets($users_file);
    $user_data_arr = explode('|', $user_data);
    $users[] = $user_data_arr[0];
    $points[] = $user_data_arr[1];
}
fclose($users_file);


// Process the logic
for ($i = 0; $i < count($users); $i++) {
    if ($points[$i] > 5) {
        $points[$i] = $points[$i] - 5;
    }
}

// Save the data back to the file
$users_file = fopen("users.txt", "w") or die("Unable to open file!");
for ($i = 0; $i < count($users); $i++) {
    fwrite($users_file, $users[$i] . '|' . $points[$i] . "\n");
}
fclose($users_file);



// Create an array to store all the messages
$messages = array();

// Create the messages
for ($i = 0; $i < count($users); $i++) {
	if ($points[$i] == 0) {
		$messages[] = "Congratulations, " . $users[$i] . ". You have reached the top of the leaderboard!";
	} elseif ($points[$i] > 0) {
		$messages[] = "Nice work, " . $users[$i] . ". You are one step ahead of the competition with " . $points[$i] . " points!";
	} else {
		$messages[] = "Keep trying, " . $users[$i] . ". You have " . $points[$i] . " points and need to work harder to catch up!";
	}
}

// Send the messages
for ($i = 0; $i < count($messages); $i++) {
    $message = $messages[$i] . "\n";
    mail($users[$i], "Status Update", $message);
}

?>