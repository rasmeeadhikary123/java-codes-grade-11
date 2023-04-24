
class MobilePhone{
    String version_no;
    int Model_no;
    String brandName;
    public static void main(String args[]){
        MobilePhone mobile1=new MobilePhone();
        mobile1.version_no="1.0.0";
        mobile1.Model_no=2;
        mobile1.brandName="samsung";
        System.out.println("the first mobile of brand"+mobile1.brandName+"with");
        System.out.println("modelNumber:"+mobile1.Model_no);
        System.out.println("versionNumber:"+mobile1.version_no);
    }
}