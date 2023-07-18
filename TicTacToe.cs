using System;

namespace HelloWorld
{
    public class TicTacToe
    {
        private readonly string[] _board = new string[9];
        private string _turn = "X";
        private string _winner = null;
        private string _line = null;

        public void StartGame()
        {
            InitializeBoard();
            PrintBoard();
            Console.Write(_turn + "'s turn, Type in a number:");
            FieldCheck();
        }

        private void InitializeBoard()
        {
            for (int i = 0; i < 9; i++)
            {
                _board[i] = Convert.ToString(i + 1);
            }
        }

        private void PrintBoard()
        {
            Console.WriteLine("-------------");
            Console.WriteLine($" {_board[0]} | {_board[1]} | {_board[2]} |");
            Console.WriteLine("-------------");
            Console.WriteLine($" {_board[3]} | {_board[4]} | {_board[5]} |");
            Console.WriteLine("-------------");
            Console.WriteLine($" {_board[6]} | {_board[7]} | {_board[8]} |");
            Console.WriteLine("-------------");
        }

        private string CheckWinner()
        {
            for (int a = 0; a < 8; a++)
            {
                switch (a)
                {
                    case 0:
                        _line = _board[0] + _board[1] + _board[2];
                        break;
                    case 1:
                        _line = _board[3] + _board[4] + _board[5];
                        break;
                    case 2:
                        _line = _board[6] + _board[7] + _board[8];
                        break;
                    case 3:
                        _line = _board[0] + _board[3] + _board[6];
                        break;
                    case 4:
                        _line = _board[1] + _board[4] + _board[7];
                        break;
                    case 5:
                        _line = _board[2] + _board[5] + _board[8];
                        break;
                    case 6:
                        _line = _board[0] + _board[4] + _board[8];
                        break;
                    case 7:
                        _line = _board[2] + _board[4] + _board[6];
                        break;
                }

                if (_line.Equals("XXX"))
                {
                    return "X";
                }
                else if (_line.Equals("OOO"))
                {
                    return "O";
                }
            }

            for (int i = 0; i < 9; i++)
            {
                if (_board[i] != "X" && _board[i] != "O")
                {
                    break;
                }
                else if (i == 8)
                {
                    return "draw";
                }
            }
            Console.Write(_turn + "'s turn, Type in a number:");
            return null;
        }

        private void FieldCheck()
        {
            while (_winner == null)
            {
                int fieldNumber;
                if (_turn == "X")
                {
                    try
                    {
                        fieldNumber = int.Parse(Console.ReadLine());
                        if (!(fieldNumber > 0 && fieldNumber <= 9))
                        {
                            Console.WriteLine("Invalid field number! Type in another number:");
                        }
                    }
                    catch (Exception)
                    {
                        Console.WriteLine("Invalid field number! Type in another number:");
                        continue;
                    }
                }
                else
                {
                    Random random = new();
                    fieldNumber = random.Next(1, 10);
                }

                if (_board[fieldNumber - 1] == Convert.ToString(fieldNumber))
                {
                    _board[fieldNumber - 1] = _turn;

                    if (_turn.Equals("X"))
                    {
                        _turn = "O";
                    }
                    else
                    {
                        _turn = "X";
                    }

                    PrintBoard();
                    _winner = CheckWinner();

                    if (_winner != null)
                    {
                        if (_winner == "draw")
                        {
                            Console.WriteLine("The game is a draw!");
                        }
                        else
                        {
                            if (_turn == "O")
                            {
                                Console.WriteLine("X wins!");
                            }
                            else
                            {
                                Console.WriteLine("Computer wins!");
                            }
                        }
                    }
                    else if (_turn == "O")
                    {
                        Console.WriteLine("Computer's turn.");
                    }
                    else
                    {
                        Console.WriteLine("X's turn. Type in a number:");
                    }
                }
                else
                {
                    Console.WriteLine("Field already taken! Type in another number: ");
                }
            }
        }
    }
}