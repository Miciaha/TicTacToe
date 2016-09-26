/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Miciaha
 */
public class TicTacToe {
    
        //Initializing values
        Scanner sc = new Scanner(System.in);
        
        boolean playing = true;
    
        char one;
        char two;
        char three;
        char four;
        char five;
        char six;
        char seven;
        char eight;
        char nine;
        
    public void start()
    {//Necessary to clear the board if player wants to play again
         one   = '1';
         two   = '2';
         three = '3';
         four  = '4';
         five  = '5';
         six   = '6';
         seven = '7';
         eight = '8';
         nine  = '9';
         
         System.out.println("\nHow many players? 1 or 2?");
         int option = sc.nextInt();
            switch (option) {
                case 1:
                    drawBoard1();
                    break;
                case 2:
                    drawBoard2();
                    break;
                default:
                    System.out.println("\nNot a valid option.");
                    start();
                    break;
            }
    }
    
    public void drawBoard1()
    {//Creates TicTacToe board and runs conditional checks
        
        while (playing = true)
        {
        
            System.out.println("\n");
            System.out.print("   |   |   \n " + one + " | " + two + " | " + three + "\n___|___|___ \n");
            System.out.print("   |   |   \n " + four + " | " + five + " | " + six +"\n___|___|___ \n");
            System.out.print("   |   |   \n " + seven + " | " + eight + " | " + nine + " \n   |   |    ");
        
            System.out.print("\n\nPlease enter the number where you would like to place your token (1-9):");
            tacSetOne();
        
            System.out.print("   |   |   \n " + one + " | " + two + " | " + three + "\n___|___|___ \n");
            System.out.print("   |   |   \n " + four + " | " + five + " | " + six +"\n___|___|___ \n");
            System.out.print("   |   |   \n " + seven + " | " + eight + " | " + nine + " \n   |   |    ");
        
            winningConditions();
            computerTac();
            winningConditions();
        
        
    }
    }
    
    public void drawBoard2()
    {//Creates TicTacToe board and runs conditional checks
        
        while (playing = true)
        {
        
            
        System.out.print("   |   |   \n " + one + " | " + two + " | " + three + "\n___|___|___ \n");
        System.out.print("   |   |   \n " + four + " | " + five + " | " + six +"\n___|___|___ \n");
        System.out.print("   |   |   \n " + seven + " | " + eight + " | " + nine + " \n   |   |    ");
        
        tacSetOne();
        winningConditions();
        
        System.out.print("   |   |   \n " + one + " | " + two + " | " + three + "\n___|___|___ \n");
        System.out.print("   |   |   \n " + four + " | " + five + " | " + six +"\n___|___|___ \n");
        System.out.print("   |   |   \n " + seven + " | " + eight + " | " + nine + " \n   |   |    ");
        
        tacSetTwo();
        winningConditions();
        
        
    }
    }
    
    public void tacSetOne()
    { //Takes players input and sets their token in the appropriate position
        
        check();
        
        System.out.println("\nPlayer one, make your move!");
        int x = sc.nextInt();
        
         if( x == 1 && one == '1')
        {
            one = 'X';
        } 
        else if ( x == 2 && two == '2')
        {
            two = 'X';
        }    
        else if ( x == 3 && three == '3')
        {
            three = 'X';
        }
        else if ( x == 4 && four == '4')
        {
            four = 'X';
        }
        else if ( x == 5 && five == '5')
        {
            five = 'X';
        }
        else if ( x == 6 && six == '6')
        {
            six = 'X';
        }
        else if ( x == 7 && seven == '7')
        {
            seven = 'X';
        }
        else if ( x == 8 && eight == '8')
        {
            eight = 'X';
        }
        else if ( x == 9 && nine == '9')
        {
            nine = 'X';
        }
        
        else 
        {
            System.out.print("\nThat spot is already taken\n Enter a different value: ");
            tacSetOne();
        }
    }
    
    public void tacSetTwo()
    { //Takes players input and sets their token in the appropriate position
        
        check();
        
        System.out.println("\nPlayer two, make your move!");
        int x = sc.nextInt();
        
        if( x == 1 && one == '1')
        {
            one = 'O';
        } 
        else if ( x == 2 && two == '2')
        {
            two = 'O';
        }    
        else if ( x == 3 && three == '3')
        {
            three = 'O';
        }
        else if ( x == 4 && four == '4')
        {
            four = 'O';
        }
        else if ( x == 5 && five == '5')
        {
            five = 'O';
        }
        else if ( x == 6 && six == '6')
        {
            six = 'O';
        }
        else if ( x == 7 && seven == '7')
        {
            seven = 'O';
        }
        else if ( x == 8 && eight == '8')
        {
            eight = 'O';
        }
        else if ( x == 9 && nine == '9')
        {
            nine = 'O';
        }
        
        else 
        {
            System.out.print("\nThat spot is already taken\n Enter a different value: ");
            tacSetTwo();
        }
    }
    
    public void winningConditions()
    {   //Eight Possible Winning combinations
        //1
        if (one == two && two == three)
        {
           
            if(two == 'X')
            {
                System.out.println("\nPLAYER ONE WINS!");
                
            } else if(two == 'O'){ System.out.println("\nPLAYER TWO WINS!");}
            
            playMore();
        }
        //2
        else if(four == five && five == six)
          {
              if(five == 'X')
              {
                  System.out.println("\nPLAYER ONE WIN!");
              
              }else if (five == 'O'){System.out.println("\nPLAYER TWO WINS!");}
          
              playMore();
          }
        //3
        else if(seven == eight && eight == nine)
          {
              if(eight == 'X')
              {
                  System.out.println("\nPLAYER ONE WINS!");
              } else if(eight == 'O'){System.out.println("\nPLAYER TWO WINS!");}
           
             playMore();
          }
        //4
        else if(one == four && four == seven)
          {
              if(four == 'X')
              {
                  System.out.println("\nPLAYER ONE WINS!");
              } else if(eight == 'O'){System.out.println("\nPLAYER TWO WINS!");}
              
              playMore();
          }
        //5
        else if(two == five && five == eight)
          {
              if(five == 'X')
              {
                  System.out.println("\nPLAYER ONE WINS!");
              } else if(eight == 'O'){System.out.println("\nPLAYER TWO WINS");}
              
              playMore();
          }
        //6
        else if(three == six && six == nine)
          {
          
              if(six == 'X')
              {
                  System.out.println("\nPLAYER ONE WINS!");
              } else if(eight == 'O'){System.out.println("\nPLAYER TWO WINS!");}
          
              playMore();
          }
        //7
        else if(one == five && five == nine)
          {
          
              if(five == 'X')
              {
                  System.out.println("\nPLAYER ONE WINS!");
              } else if(five == 'O'){System.out.println("\nPLAYER TWO WINS!");}
          
              playMore();
          }
        //8
        else if(three == five && five == seven)
          {
          
              if(five == 'X')
              {
                  System.out.println("\nPLAYER ONE WINS!");
              } else if(five == 'O'){System.out.println("\nPLAYER TWO WINS!");}
          
              playMore();
          }
    }
    
    public void computerTac()
    {
        Random rand = new Random();
        int y = rand.nextInt(10);
        
         if( y == 1 && one == '1')
        {
            one = 'O';
        } 
        else if ( y == 2 && two == '2')
        {
            two = 'O';
        }    
        else if ( y == 3 && three == '3')
        {
            three = 'O';
        }
        else if ( y == 4 && four == '4')
        {
            four = 'O';
        }
        else if ( y == 5 && five == '5')
        {
            five = 'O';
        }
        else if ( y == 6 && six == '6')
        {
            six = 'O';
        }
        else if ( y == 7 && seven == '7')
        {
            seven = 'O';
        }
        else if ( y == 8 && eight == '8')
        {
            eight = 'O';
        }
        else if ( y == 9 && nine == '9')
        {
            nine = 'O';
        }
        else if (nine != '9' && eight != '8' && seven != '7' && six != '6' && five != '5' && four != '4' && three != '3' && two != '2' && one != '1')
        {
            System.out.println("\nDraw!");
            playMore();
        }
        else
        {
            computerTac();
        }
    }
    
    public void playMore()
    {
        
        System.out.print("   |   |   \n " + one + " | " + two + " | " + three + "\n___|___|___ \n");
        System.out.print("   |   |   \n " + four + " | " + five + " | " + six +"\n___|___|___ \n");
        System.out.print("   |   |   \n " + seven + " | " + eight + " | " + nine + " \n   |   |    ");
    
        int z = 0;
        while (z!=1 || z!=2)
        {
            System.out.print("\n\nWould you like to play again?\nEnter 1 for Yes\nEnter 2 for No: ");
            z = sc.nextInt();
        
            if (z == 1)
            {
                start();
            }
           else if (z == 2)
            {
            System.out.println("\nThanks for playing! :D");
            System.exit(0);
            }
        }
        
      
       
     }
    
    private void check()
    {
        if (nine != '9' && eight != '8' && seven != '7' && six != '6' && five != '5' && four != '4' && three != '3' && two != '2' && one != '1')
        {
            System.out.println("\nDraw!");
            playMore();
        }
    }
}

