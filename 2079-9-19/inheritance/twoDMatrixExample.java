 class twoDArrayExample{
    public static void main(String[] args) {
        int[][] twoDMatrix=new int[2][2];
        twoDMatrix[0][0]=1;
        twoDMatrix[0][1]=2;
        twoDMatrix[1][0]=3;
        twoDMatrix[1][1]=4;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(twoDMatrix[i][j]+"");
            }
            System.out.println();
        }
    }
            
    }
