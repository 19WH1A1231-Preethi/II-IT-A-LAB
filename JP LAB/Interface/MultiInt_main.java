interface Bank
{
  void accountNumber();
}
interface Loan
{
  void getROI();
}
class Multi implements Bank,Loan
{
  public void accountNumber()
  {
    System.out.println("Details of account");
  }
  public void getROI()
  {
    System.out.println("rate of interest");
  }
}
class MultiInt_main
{
  public static void main(String args[])
  { 
    Multi m = new Multi();
    m.accountNumber();
    m.getROI();
  }
}