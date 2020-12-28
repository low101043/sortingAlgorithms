module InputOutput where

import Data.Char

menu :: IO Int  -- The menu
menu = do
        putStrLn "\nPlease select an option to choose a Sorting Algorithm.  \n 1. Bubble Sort  \n 2. Insertion Sort \n 3. Merge Sort \n 4. Quick Sort \n 5. Exit \n Enter 1, 2, 3, 4 or 5: "
        xs <- getLine
        case xs of          -- returns the case
          "1" -> return 1
          "2" -> return 2
          "3" -> return 3
          "4" -> return 4
          "5" -> return 5
          otherwise -> do  -- If an incorrect answer
                         answer <- menu
                         return answer

inputList :: Int -> [Int] -> IO [Int]   --Gets the input list
inputList 0 xs = return (reverse xs)
inputList n (xs) = do
                   x <- getLine  --Gets the digit
                   if x /= [] && all isDigit x  --Checks its an actual number
                      then do 
                              let xInt = read x :: Int
                              inputList (n-1) ( xInt:xs)
                      else
                          do
                            putStrLn "Wrong Input"
                            inputList n xs
                        
howMany :: IO Int   --Gets how many to do
howMany = do
            putStrLn "\nPlease enter the number of elements to be sorted: "
            xs <- getLine
            if xs /= [] && all isDigit xs 
              then return (read xs)
            else 
              do 
                putStrLn "Invalid Number"
                howMany

input :: IO [Int]
input = do
          x <- howMany
          putStrLn ("Please enter " ++ show x ++ " Integers:")
          inputList x []