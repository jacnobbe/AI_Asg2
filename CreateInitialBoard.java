package main;

import java.util.LinkedList;
import java.util.List;

public class CreateInitialBoard {

	public void expandNext( int[][] boardGame, int[][] moveDirs, int[][] currentState )
	{
		List<BoardState> children = new LinkedList<BoardState>();

		for(int i = 0; i < moveDirs.length; i++)
		{
			for(int j = 0; j < moveDirs[0].length; j++)
			{
				moveDirs[i][j] =- 1000; 
				if(moveDirs[i][j] > 0 ) //can move left
				{
					spawnMoveDown(i, j); 
				}
				else //(moveDirs[i][j] < 0 )  // cannot move left
				{
					moveDirs[i][j] =+ 1000; 
				}
				
				moveDirs[i][j] =- 100; 
				if(moveDirs[i][j] > 0 ) //can move down
				{
					
				}
				if(moveDirs[i][j] < 0 )  // cannot move down
				{
					moveDirs[i][j] =+ 1000; 
				}
				
				moveDirs[i][j] =- 10; 
				if(moveDirs[i][j] > 0 ) //can move left
				{
					
				}
				if(moveDirs[i][j] < 0 )  // cannot move left
				{
					moveDirs[i][j] =+ 10; 
				}
				
				//easier way for this last clause
				moveDirs[i][j] =- 1; 
				if(moveDirs[i][j] > 0 ) //can move left
				{
					
				}
				if(moveDirs[i][j] < 0 )  // cannot move left
				{
					moveDirs[i][j] =+ 1; 
				}
			}
		}
	}

	private void spawnMoveDown(int i, int j) 
	{
		// TODO Auto-generated method stub
		getPegPositions(i,j); 
		BoardState child = new BoardState(newPegs, boardState.getPathCost() + 1);
		children.add(child);
	}

}

// What can be expanded from a particular node? Check with 
checkGoal()
{
		for( int i = 0; i < gameBoard[]; i++ )
		{
			for( int j = 0; j < gameBoard[].; j++ )
			{
				if(pegsRemaining <= 1)
				{
					
				}
				else
					return; 
			}
		}
	}
}
gameBoard[i][j] - 1 // check if peg is there, if yes
gameBoard[i][j] - 2 // check if peg is there

List<BoardStates> trail; 
List<BoardStates> children; 
startNode;
currentBoardState = initialBoardState; 
nodeInQ = startNodeCoordinates; 
if (nodeInQ[i + 1][j] == 1 && nodeInQ[i + 2][j] == 1)
{
	children.add()
	
	currentBoardState[i][j] = 1; 
	currentBoardState[i + 1][j] = 0; 
	currentBoardState[i + 2][j] = 0; 
	children.add(currentBoardState); 
}
lastMoved [i,j]
		check -1, -2
			move it
			store it
			move it back
		check +1, +2
			move it
			store it
			

			
	
			

