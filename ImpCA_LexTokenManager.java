/* Generated By:JavaCC: Do not edit this line. ImpCA_LexTokenManager.java */

/** Token Manager. */
public class ImpCA_LexTokenManager implements ImpCA_LexConstants
{
        static int commentLevel = 0 ;

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_1(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x800000000000L) != 0L)
            return 12;
         if ((active0 & 0x100000000L) != 0L)
            return 32;
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 78;
            return 2;
         }
         if ((active0 & 0x73fdfc00L) != 0L)
         {
            jjmatchedKind = 78;
            return 25;
         }
         return -1;
      case 1:
         if ((active0 & 0x444000L) != 0L)
            return 25;
         if ((active0 & 0x77b9bc00L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 1;
            return 25;
         }
         return -1;
      case 2:
         if ((active0 & 0x6798b800L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 2;
            return 25;
         }
         if ((active0 & 0x10210400L) != 0L)
            return 25;
         return -1;
      case 3:
         if ((active0 & 0x42883800L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 3;
            return 25;
         }
         if ((active0 & 0x25108000L) != 0L)
            return 25;
         return -1;
      case 4:
         if ((active0 & 0x2881000L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 4;
            return 25;
         }
         if ((active0 & 0x40002800L) != 0L)
            return 25;
         return -1;
      case 5:
         if ((active0 & 0x2000000L) != 0L)
            return 25;
         if ((active0 & 0x881000L) != 0L)
         {
            jjmatchedKind = 78;
            jjmatchedPos = 5;
            return 25;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_1(int pos, long active0)
{
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 7;
         return jjMoveStringLiteralDfa1_1(0x100L);
      case 33:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_1(0x2000000000L);
      case 37:
         return jjStopAtPos(0, 35);
      case 40:
         return jjStopAtPos(0, 42);
      case 41:
         return jjStopAtPos(0, 43);
      case 42:
         return jjStopAtPos(0, 33);
      case 43:
         return jjStopAtPos(0, 31);
      case 44:
         return jjStopAtPos(0, 44);
      case 45:
         return jjStartNfaWithStates_1(0, 32, 32);
      case 46:
         return jjStartNfaWithStates_1(0, 47, 12);
      case 47:
         jjmatchedKind = 34;
         return jjMoveStringLiteralDfa1_1(0x200L);
      case 58:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_1(0x1000000000000L);
      case 59:
         return jjStopAtPos(0, 45);
      case 60:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_1(0x10000000000L);
      case 61:
         return jjStopAtPos(0, 36);
      case 62:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_1(0x20000000000L);
      case 63:
         return jjStopAtPos(0, 49);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_1(0x400L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_1(0x1800L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_1(0x2000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_1(0x4000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_1(0x18000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_1(0xc0000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_1(0x100000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_1(0x200000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_1(0x400000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_1(0x800000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_1(0x3000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_1(0x4000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_1(0x30000000L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_1(0x40000000L);
      default :
         return jjMoveNfa_1(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      case 45:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         break;
      case 61:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         else if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(1, 48);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_1(active0, 0x10100000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_1(active0, 0x3000800L);
      case 70:
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_1(1, 18, 25);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_1(active0, 0x44000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_1(active0, 0x8000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_1(active0, 0x90400L);
      case 79:
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_1(1, 14, 25);
         return jjMoveStringLiteralDfa2_1(active0, 0x20203000L);
      case 82:
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_1(1, 22, 25);
         return jjMoveStringLiteralDfa2_1(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_1(0, active0);
}
static private int jjMoveStringLiteralDfa2_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_1(active0, 0x1000000L);
      case 68:
      case 100:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_1(2, 10, 25);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_1(2, 16, 25);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_1(active0, 0x4000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_1(active0, 0x800L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_1(active0, 0x60100000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_1(active0, 0x2000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_1(active0, 0x801000L);
      case 82:
      case 114:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_1(2, 28, 25);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_1(active0, 0x8000L);
      case 84:
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_1(2, 21, 25);
         return jjMoveStringLiteralDfa3_1(active0, 0x2080000L);
      default :
         break;
   }
   return jjStartNfa_1(1, active0);
}
static private int jjMoveStringLiteralDfa3_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 68:
      case 100:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_1(3, 29, 25);
         break;
      case 69:
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_1(3, 15, 25);
         return jjMoveStringLiteralDfa4_1(active0, 0x80000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_1(active0, 0x800000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_1(active0, 0x800L);
      case 76:
      case 108:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_1(3, 24, 25);
         return jjMoveStringLiteralDfa4_1(active0, 0x40001000L);
      case 78:
      case 110:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_1(3, 20, 25);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_1(3, 26, 25);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_1(active0, 0x2000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_1(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_1(2, active0);
}
static private int jjMoveStringLiteralDfa4_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_1(4, 30, 25);
         return jjMoveStringLiteralDfa5_1(active0, 0x1000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_1(active0, 0x80000L);
      case 78:
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_1(4, 11, 25);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_1(active0, 0x2800000L);
      case 84:
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_1(4, 13, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_1(3, active0);
}
static private int jjMoveStringLiteralDfa5_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_1(active0, 0x801000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_1(active0, 0x80000L);
      case 78:
      case 110:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_1(5, 25, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_1(4, active0);
}
static private int jjMoveStringLiteralDfa6_1(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_1(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 77:
      case 109:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_1(6, 23, 25);
         break;
      case 78:
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_1(6, 12, 25);
         break;
      case 82:
      case 114:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_1(6, 19, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_1(5, active0);
}
static private int jjStartNfaWithStates_1(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_1(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0x800000000L, 0x0L
};
static final long[] jjbitVec1 = {
   0x0L, 0x0L, 0x100000000000L, 0x0L
};
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 32;
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
               case 2:
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 78)
                     kind = 78;
                  jjCheckNAdd(25);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 3);
                  else if (curChar == 45)
                     jjCheckNAddStates(4, 7);
                  else if (curChar == 34)
                     jjCheckNAddStates(8, 13);
                  else if (curChar == 46)
                     jjCheckNAdd(12);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 71)
                        kind = 71;
                     jjCheckNAdd(9);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 71)
                        kind = 71;
                  }
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 11);
                  else if (curChar == 46)
                     jjCheckNAdd(12);
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(27, 28);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 71)
                        kind = 71;
                     jjCheckNAdd(9);
                  }
                  break;
               case 8:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if (curChar == 48 && kind > 71)
                     kind = 71;
                  break;
               case 11:
                  if (curChar == 46)
                     jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 74)
                     kind = 74;
                  jjCheckNAdd(12);
                  break;
               case 13:
                  if (curChar == 34)
                     jjCheckNAddStates(8, 13);
                  break;
               case 14:
                  if ((0xfffffffb00000000L & l) != 0L)
                     jjCheckNAddStates(8, 13);
                  break;
               case 15:
                  if (curChar == 61)
                     jjCheckNAddStates(8, 13);
                  break;
               case 16:
                  if (curChar == 33)
                     jjCheckNAdd(15);
                  break;
               case 17:
                  if (curChar == 60)
                     jjCheckNAdd(15);
                  break;
               case 18:
                  if (curChar == 62)
                     jjCheckNAdd(15);
                  break;
               case 19:
                  if (curChar == 34 && kind > 76)
                     kind = 76;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 3);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 28:
                  if (curChar != 46)
                     break;
                  if (kind > 74)
                     kind = 74;
                  jjCheckNAdd(29);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 74)
                     kind = 74;
                  jjCheckNAdd(29);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 11);
                  break;
               case 31:
                  if (curChar == 45)
                     jjCheckNAddStates(4, 7);
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
               case 2:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 78)
                        kind = 78;
                     jjCheckNAdd(25);
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 78)
                        kind = 78;
                     jjCheckNAdd(25);
                  }
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if ((0x2000000020L & l) != 0L && kind > 69)
                     kind = 69;
                  break;
               case 1:
                  if ((0x20000000200000L & l) != 0L)
                     jjCheckNAdd(0);
                  break;
               case 4:
                  if ((0x8000000080000L & l) != 0L)
                     jjCheckNAdd(0);
                  break;
               case 5:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 14:
                  if ((0x7fffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(8, 13);
                  break;
               case 20:
                  if (curChar == 92)
                     jjAddStates(14, 16);
                  break;
               case 21:
                  if (curChar == 92)
                     jjCheckNAddStates(8, 13);
                  break;
               case 22:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x400000004000L & l) != 0L)
                     jjCheckNAddStates(8, 13);
                  break;
               case 24:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 78)
                     kind = 78;
                  jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 78)
                     kind = 78;
                  jjCheckNAdd(25);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(8, 13);
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
      if ((i = jjnewStateCnt) == (startsAt = 32 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 47:
         return jjMoveStringLiteralDfa1_0(0x2L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x2L) != 0L)
            return jjStopAtPos(1, 1);
         break;
      case 47:
         if ((active0 & 0x4L) != 0L)
            return jjStopAtPos(1, 2);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   27, 28, 30, 11, 8, 27, 30, 11, 14, 16, 17, 18, 19, 20, 13, 21, 
   22, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec0[i2] & l2) != 0L);
      case 32:
         return ((jjbitVec1[i2] & l2) != 0L);
      default :
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, "\53", "\55", "\52", "\57", "\45", "\75", "\41\75", "\76", 
"\74", "\74\75", "\76\75", "\50", "\51", "\54", "\73", "\72", "\56", "\72\75", "\77", 
"\41", null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "COMMENT",
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x7fffff7fdfc01L, 0x54a0L, 
};
static final long[] jjtoSkip = {
   0x3feL, 0x0L, 
};
static protected JavaCharStream input_stream;
static private final int[] jjrounds = new int[32];
static private final int[] jjstateSet = new int[64];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public ImpCA_LexTokenManager(JavaCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ImpCA_LexTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 32; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
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

static int curLexState = 1;
static int defaultLexState = 1;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
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
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       if (jjmatchedPos == 0 && jjmatchedKind > 3)
       {
          jjmatchedKind = 3;
       }
       break;
     case 1:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
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

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                        commentLevel++;
         break;
      case 2 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                        commentLevel--;
                            if(commentLevel == 0){  SwitchTo(DEFAULT); }
         break;
      case 9 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
               commentLevel++;
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
