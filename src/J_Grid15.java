public class J_Grid15 {
    int [][] m_board;
    J_Grid15 () {
        m_board = new int[3][3];
    }

    // 输出棋盘的格线行
    private void mb_outputGridRowBoard() {
        int i;
        System.out.print("+");
        for(i = 0; i < 5; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    // 输出棋盘的数据行
    private void mb_outputGridRowBoard(int i) {
        int j;
        for(j = 0; j < m_board[i].length; j++) {
            System.out.println("|" + m_board[i][j]);
        }
        System.out.println("|");
    }

    // 输出棋盘
    public void mb_outputGrid() {
        int i;
        mb_outputGridRowBoard();
        for(i = 0; i < m_board.length; i++) {
            mb_outputGridRowBoard(i);
            mb_outputGridRowBoard();
        }
    }

    // 初始化数据
    private void mb_dataInit() {
        int i, j, k;
        for(i=0, k=1; i < m_board.length; i++) {
            for(j = 0; j < m_board[i].length; j++, k++) {
                m_board[i][j] = k;
            }
        }
    }

    // 数据结束检测
    // 返回值说明：当数据为最后一个数据时，返回true; 否则，返回false
    private boolean mb_dataEnd() {
        int i, j, k;
        for (i = 0, k = 9; i < m_board.length; i++) {
            for(j = 0; j < m_board[i].length; j++, k--) {
                if(m_board[i][j] != k){
                    return false;
                }
            }
        }
        return true;
    }

//    // 取下一个数据
//    private void mb_dataNext() {
//        int i, j;
//        for(i = m_board[i].length - 1; i >=0; i--){
//            for(j = m_board[i].length-1; j>=0; j--){
//                if(m_board[i][j] == 9){
//                    m_board[i][j] = 1;
//                } else {
//                    m_board[i][j]++;
//                    return;
//                }
//            }
//        }
//    }


}
