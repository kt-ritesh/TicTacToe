package tictactoe;

public class Board{
    int size;
    char [][] matrix;

    public Board(int size){
        this.size = size;
        matrix = new char[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = '-';
            }
        }
    }   

}