// imports
use std::io;
use std::string;

fn main() {
    println!("Welcome to 'One Step Ahead'!");

    // Creating variables to store player data
    let mut player_name = String::new();
    let mut player_score: u32 = 0;

    //Getting the player's name
    println!("Please enter your name:");
    io::stdin().read_line(&mut player_name).expect("Failed to read line");

    // Looping through the game
    loop {
        let mut choice = String::new();
        println!("Enter your choice: ");
        io::stdin().read_line(&mut choice).expect("Failed to read line");

        let choice: u32 = match choice.trim().parse() {
            Ok(num) => num,
            Err(_) => 0,
        };

        // Logic for the game
        let result = if choice % 4 == 0 {
            player_score += 2;
            println!("You got it right! Your score is now {}", player_score);
            true
        } else {
            player_score -= 1;
            println!("You got it wrong! Your score is now {}", player_score);
            false
        };

        // Checking if the player's score is 0 or below
        if player_score <= 0 {
            println!("Game Over! {} loses", player_name);
            break;
        }

        // Switching player
        if result {
            println!("Next player please!");
        }
    }
}