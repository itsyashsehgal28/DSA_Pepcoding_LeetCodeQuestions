// video 137

class CustomStack
{
  static int MAX = 10;
  int top;
  int arr[] = new int[MAX];	// Maximum size of Stack


  boolean isEmpty ()
  {
    return (top < 0);
  }
  CustomStack ()
  {
    top = -1;
  }

  boolean push (int x)
  {
    if (top >= (MAX - 1))
      {
	System.out.println ("Overflow condition reached");
	return false;
      }
    else
      {
	arr[++top] = x;
	System.out.println (x + " pushed into stack");
	return true;
      }
  }


  int pop ()
  {
    if (top < 0)
      {
	System.out.println ("Underflow condition reached");
	return 0;
      }
    else
      {
	int x = arr[top--];
	return x;
      }
  }


  int peek ()
  {
    if (top < 0)
      {
	System.out.println ("Underflow condition");
	return 0;
      }
    else
      {
	int x = arr[top];
	return x;
      }
  }
}

class BuildNormalStack
{
  public static void main (String args[])
  {
    CustomStack stk = new CustomStack ();
      stk.push (20);
      stk.push (40);
      stk.push (60);
      System.out.println ("element poped out : " + stk.pop ());
  }
}