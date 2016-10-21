# AI_Asg2
1. Pregame Werk
    * Program accepts game board and other relavant information (specify)
    x Calculate board positions / possible move directions for each peg
    * Calculate all possible moves for all pegs (71). // do we need to do this? 
2. Search(es)
    * Searching through all possible moves calculated in 1.
    * Scan board to see if all pegs are still playable. If not, try somewhere else.
    * Types of searches: 
         * Depth-First
         * Breadth-First
         * Uniform-Cost
         * Greedy-Best First
         * A*
3. Output Results


-----------------------------------------------------------------------------
TO DO: 
  * Create file chooser to accept initial game board
  * Function to anaylse uploaded board
      * Board in specific format when uploaded
      * Analyse board to set hieght and width of board to set limits in code  
          * Ex: peg: 7x7, missionaries: 3x3
  * Create array of board with number of possible moves using a byte. 
  * Create counter for total moves. 
