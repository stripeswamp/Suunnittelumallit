import java.util.Random;
import java.util.Scanner;

class BlindBoard extends Game {
    
    int size;
    int x,y;
    int score;
    int[][] board;
    boolean isitOver;
    
    BlindBoard()
    {
        this.size = 8;
        this.score = 0;
        this.board = new int[this.size][this.size];
        this.isitOver = false;
    }
    
    void initializeGame()
    {
        Random random = new Random();
        
        for(int n = 0; n < 2*this.size; n++)
        {
            this.x = random.nextInt(this.size);
            this.y = random.nextInt(this.size);
  
            while(board[this.x][this.y]==1)
            {
                this.x = random.nextInt(this.size);
                this.y = random.nextInt(this.size);
            }
          
            board[this.x][this.y] = 1;
        }
    }
    
    void makePlay(int player)
    {
            Scanner inputReader = new Scanner(System.in);
            System.out.print("Hit x-coordinate (0-7): ");
            int inputX = inputReader.nextInt();
            
            while(inputX < 0 || inputX > 7)
            {
                System.out.print("Over board! Hit x-coordinate (0-7): ");
                inputX = inputReader.nextInt();
            }
            
            System.out.print("Hit y-coordinate (0-7): ");
            int inputY = inputReader.nextInt();
            
            while(inputY < 0 || inputY > 7)
            {
                System.out.print("Over board! Hit x-coordinate (0-7): ");
                inputY = inputReader.nextInt();
            }
            
            System.out.println("Score: " + this.score);
            
            if(this.board[inputX][inputY] == 1)
            {
                this.score++;
                this.board[inputX][inputY] = 0;
            }

            if(this.score == 3)
            {
                this.isitOver = true;
            }
    }
    
    boolean endOfGame()
    {
        if(this.isitOver == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    void printWinner()
    {
        if(this.score == 0)
        {
            System.out.println("We have no winner!");
        }
        else
        {
            System.out.println("We have a winner! Score: " + this.score);
        }
    }
}
