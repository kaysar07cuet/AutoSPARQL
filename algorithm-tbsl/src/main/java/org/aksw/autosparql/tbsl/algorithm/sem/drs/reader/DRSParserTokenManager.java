/* Generated By:JavaCC: Do not edit this line. DRSParserTokenManager.java */
package org.aksw.autosparql.tbsl.algorithm.sem.drs.reader;

/** Token Manager. */
public class DRSParserTokenManager implements DRSParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xffe00L) != 0L)
         {
            jjmatchedKind = 21;
            return 4;
         }
         return -1;
      case 1:
         if ((active0 & 0x9fc00L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 21;
               jjmatchedPos = 1;
            }
            return 4;
         }
         if ((active0 & 0x60200L) != 0L)
            return 4;
         return -1;
      case 2:
         if ((active0 & 0x9fc00L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 2;
            return 4;
         }
         if ((active0 & 0x200L) != 0L)
            return 4;
         return -1;
      case 3:
         if ((active0 & 0x19800L) != 0L)
            return 4;
         if ((active0 & 0x86400L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 3;
            return 4;
         }
         return -1;
      case 4:
         if ((active0 & 0x400L) != 0L)
            return 4;
         if ((active0 & 0x86000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 4;
            return 4;
         }
         return -1;
      case 5:
         if ((active0 & 0x86000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 5;
            return 4;
         }
         return -1;
      case 6:
         if ((active0 & 0x82000L) != 0L)
            return 4;
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 6;
            return 4;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 6);
      case 41:
         return jjStopAtPos(0, 7);
      case 44:
         return jjStopAtPos(0, 5);
      case 58:
         return jjStopAtPos(0, 1);
      case 61:
         return jjStopAtPos(0, 8);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x10800L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x20200L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x6000L);
      case 91:
         return jjStopAtPos(0, 2);
      case 93:
         return jjStopAtPos(0, 4);
      case 124:
         return jjStopAtPos(0, 3);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 70:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x6000L);
      case 79:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x81a00L);
      case 82:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 4);
         break;
      case 86:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0xe400L);
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 84:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 4);
         break;
      case 87:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 4);
         break;
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 77:
         return jjMoveStringLiteralDfa4_0(active0, 0x82000L);
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 84:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 4);
         break;
      case 87:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 4);
         break;
      case 89:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 69:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 89:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(4, 10, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 78:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 83:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 84:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 4);
         break;
      case 89:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 84:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((0x3ff400800000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  else if (curChar == 58)
                     jjCheckNAdd(5);
                  if ((0x3ff008000000000L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(2);
                  }
                  break;
               case 0:
                  if ((0x3ff400800000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  else if (curChar == 39)
                     jjCheckNAdd(9);
                  else if ((0x8000000200000000L & l) != 0L)
                     jjCheckNAdd(7);
                  if ((0x3ff008000000000L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(2);
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 20)
                     kind = 20;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x3ff008000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0x3ff400800000000L & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 5:
                  if ((0x3ff400800000000L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjCheckNAdd(5);
                  break;
               case 6:
                  if ((0x8000000200000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjCheckNAdd(7);
                  break;
               case 8:
                  if (curChar == 39)
                     jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 10:
                  if (curChar == 39 && kind > 24)
                     kind = 24;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(2);
                  }
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(2);
                  }
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(3, 4);
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 23)
                     kind = 23;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 9:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   9, 10, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\72", "\133", "\174", "\135", "\54", "\50", "\51", "\75", "\116\117\124", 
"\105\126\105\122\131", "\115\117\123\124", "\123\117\115\105", "\124\110\105\115\117\123\124", 
"\124\110\105\114\105\101\123\124", "\101\106\105\127", "\115\101\116\131", "\116\117", "\117\122", 
"\110\117\127\115\101\116\131", null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffffL, 
};
static final long[] jjtoSkip = {
   0x1e000000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[11];
private final int[] jjstateSet = new int[22];
protected char curChar;
/** Constructor. */
public DRSParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public DRSParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
