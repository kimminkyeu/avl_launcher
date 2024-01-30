package main;

public class MkAssert
{
  public static void MK_ASSERT_DEV(String developer, boolean expr, String message)
  {
    assert (expr) : (developer + ": " + message);
    /*
    assert (expr) : (developer + ": " + message
            + " at line " + Thread.currentThread().getStackTrace()[1].getLineNumber() );
    */
  }
}
