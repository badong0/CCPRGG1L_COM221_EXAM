public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'A', 'S', 'R', 'S', 'S', 'U', 'U', 'I', 'O', 'L', 'M', 'A', 'U', 'Z', 'F' },
                { 'Q', 'B', 'N', 'E', 'H', 'U', 'W', 'E', 'B', 'E', 'S', 'K', 'G', 'I', 'T' }, //huwebes row 1 column 4-10
                { 'B', 'A', 'N', 'A', 'N', 'A', 'Q', 'U', 'E', 'N', 'U', 'R', 'N', 'U', 'H' }, //November row 3 column = 9
                { 'Q', 'U', 'K', 'N', 'Q', 'L', 'S', 'L', 'X', 'O', 'M', 'A', 'J', 'S', 'G' },
                { 'L', 'T', 'W', 'O', 'C', 'E', 'H', 'I', 'R', 'V', 'L', 'W', 'M', 'L', 'I' },
                { 'M', 'I', 'T', 'U', 'V', 'Z', 'S', 'E', 'O', 'E', 'Y', 'B', 'G', 'E', 'L' },
                { 'Q', 'W', 'K', 'L', 'E', 'C', 'U', 'J', 'X', 'M', 'N', 'F', 'W', 'K', 'G' },
                { 'K', 'L', 'G', 'Y', 'N', 'Q', 'P', 'A', 'L', 'B', 'A', 'U', 'X', 'T', 'I' },
                { 'M', 'O', 'U', 'H', 'E', 'B', 'M', 'T', 'M', 'E', 'J', 'I', 'R', 'F', 'M' },
                { 'Y', 'U', 'T', 'B', 'P', 'U', 'M', 'H', 'Z', 'R', 'D', 'T', 'F', 'Y', 'N' },
                { 'S', 'J', 'R', 'K', 'J', 'S', 'B', 'X', 'I', 'S', 'S', 'D', 'P', 'Y', 'A' },
                { 'P', 'A', 'D', 'Y', 'I', 'N', 'U', 'X', 'D', 'R', 'G', 'Q', 'H', 'L', 'S' },
                { 'B', 'R', 'L', 'P', 'Q', 'T', 'I', 'H', 'O', 'F', 'S', 'U', 'M', 'R', 'Y' },
                { 'K', 'S', 'O', 'N', 'I', 'C', 'C', 'U', 'P', 'P', 'A', 'R', 'F', 'M', 'X' }, //frappuccino row=13 column 2 to 12
                { 'D', 'W', 'O', 'T', 'M', 'M', 'Q', 'B', 'O', 'U', 'H', 'J', 'L', 'G', 'C' }
        };

        // // =============================================================
        // // BANANAQUE - (10 points)
        // System.out.println(" ");
        // System.out.println("1. BANANAQUE ");
        // char row=0;
        // for(char rows=0; rows<10 ;rows++){
        //     //System.out.print(array[rows][2]);
        //     for(char columns=0; columns<9;columns++){
        //         //System.out.print(array[columns][8]);
        //         if (rows == 0){
        //             System.out.print(array[2][columns]);
        //         }
        //     }
        // }
        // System.out.print(row);
        

        // =============================================================
        // FRAPPUCCINO - (10 points)     
        // System.out.println(" ");
        // System.out.println("2. FRAPPUCCINO ");
        // for (int row = 0; row < 15; row++){
        //     System.out.println("");
        //     for (int column =2; column <13; column++){
        //         if (row == 13){
        //             System.out.print(array[row][column]);
        //         }
        //     }
        // }
        // // =============================================================
        // // NOVEMBER - (10 points)
        // System.out.println(" ");
        // System.out.println("3. NOVEMBER ");


        // for (int row =2; row<10; row++){
        //     System.out.print("");
        //     for (int columns =2; columns < 10; columns++){
        //         if(columns == 9){
        //             System.out.print(array[row][columns]);
        //         }
        //     }
        // }
        // // =============================================================
        // // TIKTOK - (10 points)
        // System.out.println(" ");
        // System.out.println("4. TIKTOK ");

        // for (int row =0; row<15; row++){
        //     System.out.print("");
        //     for (int columns =0; columns < 15; columns++){

        //         if((row ==7 && columns == 0)||(row==8 && columns == 1)||(row==9&&columns==2)||(row == 10&& columns == 3)||(row==11 && columns==4)||(row==12&&columns==5)){
        //             System.out.print(array[row][columns]);
        //         }
        //     }
        // }

        // // =============================================================
        // // BARBEQUE - (10 points)
        // System.out.println(" ");
        // System.out.println("5. BARBEQUE ");

        // for (int row =0; row<15; row++){
        //     System.out.print("");
        //     for (int columns =0; columns < 15; columns++){

        //         if((row ==12 && columns == 0)||(row==11 && columns == 1)
        //         ||(row==10&&columns==2)||(row == 9&& columns == 3)
        //         ||(row==8 && columns==4)||(row==7&&columns==5)
        //         ||(row==6 && columns==6)||(row==5&&columns==7)){
        //             System.out.print(array[row][columns]));
        //         }
        //     }
        // }

        // // =============================================================
        // // HUWEBES - (10 points)
        // System.out.println(" ");
        // System.out.println("6. HUWEBES ");

        // for(int row = 0; row < 15; row++){
        //     System.out.println("");
        //     for (int column = 4; column < 11; column++){
        //         if(row == 1){
        //             System.out.println(array[row][column]);
        //         }else{
        //             System.out.println("");
        //         }
        //     }
        // }

        // // =============================================================
        // // SANMIGLIGHT - (10 points)
        // System.out.println(" ");
        // System.out.println("7. SANMIGLIGHT ");

        // for(int row = 1; row < 12; row++){
        //     System.out.println("");
        //     for (int column = 0; column < 15; column++){
        //         if(row == 14){
        //             System.out.println(array[row][column]);
        //         }else{
        //             System.out.println("");
        //         }
        //     }
        // }
        // // =============================================================
        // // FINALEXAM - (10 points)
        // System.out.println(" ");
        // System.out.println("8. FINALEXAM ");

        for (int row =0; row<15; row++){
            System.out.print("");
                for (int columns =0; columns < 15; columns++){

                    if((row ==0 && columns == 14)||(row==1 && columns == 13)
                    ||(row==2&&columns==12)||(row == 3&& columns == 11)
                    ||(row==4 && columns==10)||(row==5&&columns==9)
                    ||(row==6 && columns==8)||(row==7&&columns==7)
                    ||(row==8&&columns==6))
                    {
                        System.out.print(array[row][columns]);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
        

        // // =============================================================
        // // LUNES - (10 points)
        // System.out.println(" ");
        // System.out.println("9. LUNES ");
        for (int row =0; row<15; row++){
            System.out.print("");
                for (int columns =0; columns < 15; columns++){

                    if((row ==4 && columns == 0)||(row==3 && columns == 1)
                    ||(row==2&&columns==2)||(row == 1&& columns == 3)
                    ||(row==0 && columns==4))
                    {
                        System.out.print(array[row][columns]);
                    }else{
                        System.out.print(" ");
                    }
                }
            }

        // // =============================================================
        // // SIOMAI - (10 points)
        // System.out.println(" ");
        // System.out.println("10. SIOMAI ");
        for (int row =0; row<15; row++){
            System.out.print("");
                for (int columns =0; columns < 15; columns++){

                    if((row ==3 && columns == 6)||(row==4 && columns == 7)
                    ||(row==5&&columns==8)||(row == 6&& columns == 9)
                    ||(row==7 && columns==10)||(row==8 && columns==11))
                    {
                        System.out.print(array[row][columns]);
                    }else{
                        System.out.print(" ");
                    }
                }
            }

        // // =============================================================

    }
}
