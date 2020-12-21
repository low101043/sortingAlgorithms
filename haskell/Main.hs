module Main where

import BubbleSort
import InsertionSort
import MergeSort
import QuickSort
import InputOutput

main :: IO ()
main = do
        putStrLn "Welcome to Sorting Algorithms using Haskell"
        x <- menu
        case x of
            1 -> do
                   y <- input
                   putStrLn "Performing Bubble Sort"
                   putStrLn (show (bubbleSort y))
                   main
            2 -> do
                   y <- input
                   putStrLn "Performing Insertion Sort"
                   putStrLn (show (isort y))
                   main
            3 -> do
                   y <- input
                   putStrLn "Performing Merge Sort"
                   putStrLn (show (msort y))
                   main
            4 -> do
                   y <- input
                   putStrLn "Performing Quick Sort"
                   putStrLn (show (qsort y))
                   main
            5 -> do
                   return ()
