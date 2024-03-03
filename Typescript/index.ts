/**
 * This is the BoardFoot program
 *
 * By: Kenny Le
 * Version: 1.0
 * Since: 2024-03-01
 */

import { createPrompt } from 'bun-promptx'

function gameResults(playerChoice) {
// this function calculates the length of a boardFoot
  const userChoice = ['R', 'P', 'S'];
  const computerChoice = userChoice[Math.floor(Math.random() * userChoice.length)];

  console.log(`Your choice: ${playerChoice}`);
  console.log(`Computer's choice: ${computerChoice}`);

if (playerChoice === computerChoice) {
        return 'result1'
    } else if (
        (playerChoice === 'R' && computerChoice === 'S') ||
        (playerChoice === 'S' && computerChoice === 'P') ||
        (playerChoice === 'P' && computerChoice === 'R')
    ) {
        return 'result2'
    } else {
        return 'result3'
    }
}


while (true) { 
  const playerChoice = prompt('Choose Rock (R), Paper (P) or Scissors (S): ')
//  playRound(playerChoice.toUpperCase())
  if (!/^[rps]$/i.test(playerChoice)) {
    console.log('Invalid Input')
    break
  } else {
      const finalResult = gameResults(playerChoice)
      if (finalResult == 'result1') {
        console.log("It's a tie!")
      } else if (finalResult == 'result2') {
        console.log("You win!")
      } else {
        console.log("Computer wins!")
      }
      break
  }
}
console.log('\nDone.')
