class StudentDetail{
    public static void main(String args[])
    {
        int[] studentDetail=new int[5];
        studentDetail[0]=1;
        studentDetail[1]=2;

        for(int i=0;i<5;i++)
        {
            if (studentDetail[i]==1)
            {
                System.out.println("Punam Dhakal");
            }
            else if(studentDetail[i]==2){
                System.out.println("Rasmi Adhikari");
            }
            else if(studentDetail[i]==3){
            System.out.println("Kusum Tiwari");
        }     else{
            System.out.println("not found");
        }
       
    }
}

}  