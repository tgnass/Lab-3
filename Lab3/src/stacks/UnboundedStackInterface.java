//----------------------------------------------------------------------------
// UnboundedStackInterface.java       by Dale/Joyce/Weems            Chapter 3
//
// Interface for a class that implements a stack of <T> with no bound
// on the size of the stack. A stack is a last-in, first-out structure.
//----------------------------------------------------------------------------

package stacks;

public interface UnboundedStackInterface extends StackInterface

{
  void push(Object o);
  // Places element at the top of this stack.

}
