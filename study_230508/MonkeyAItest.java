package study_230508;

import java.util.Random;

import bingoDAO.PlayerVO;

public class MonkeyAItest {

	Random rd = new Random();

	public static void main(String[] args) {

	}

	int MonkeyAlgo1() {
		// 1~25중 랜덤 택1
		int num = rd.nextInt(25) + 1; // 하면 1~25 랜덤 택1
		return num;
	}

	void MonkeyAlgo2() {
		// 숫자 가장 많이 오픈된 행열 쫒아간다.

	}

	void MonkeyAlgo3() {
		// 숫자 가장 많이 오픈된 행열 쫒아간다.
		// 추가로 그런 행열중 가장 많이 겹치는것 카운트해서 많은 것을 오픈한다.

	}

	void MonkeyAlgo4() {
		// 숫자 가장 많이 오픈도니 행열 쫒아간다.
		// 추가로 그런 ㅎ애열중 가장 많이 겹치는것 카운트해서 많은 것을 오픈한다.
		// 추가로 상대편의 판에서 가장 불리한 부분을 오픈한다.

	}

	PlayerVO verifBingo(PlayerVO p) {

		String unknown = "·";
		String bingo = "♥";
		String[][] hideBoard = p.getHideBoard();
		int bingoCnt = 0;
		boolean flagX;
		boolean flagY;
		boolean flagXY;
		boolean flagYX;
		int xCnt = 0;
		int yCnt = 0;

		// 행, 열, 대각선 5줄에 빙고가 있는지 확인합니다.
		// 추가로, 개수 카운트를 해서, 가장 많이 카운트된 행과 열을 추적합니다.
		flagXY = true;
		flagYX = true;
		for (int i = 0; i < 5; i++) {
			flagX = true;
			flagY = true;
			for (int j = 0; j < 5; j++) {
				if (hideBoard[i][j].equals(unknown)) {
					flagX = false;
				}
				if (hideBoard[j][i].equals(unknown)) {
					flagY = false;
				}
			}
			if (flagX) {
				for (int j = 0; j < 5; j++) {
					if (!hideBoard[i][j].equals(bingo)) {
						hideBoard[i][j] = bingo;
					}
				}
				bingoCnt++;
				flagX = false;
			}
			if (flagY) {
				for (int j = 0; j < 5; j++) {
					if (!hideBoard[j][i].equals(bingo)) {
						hideBoard[j][i] = bingo;
					}
				}
				bingoCnt++;
				flagY = false;
			}
			if (hideBoard[i][i].equals(unknown)) {
				flagXY = false;
			}
			if (hideBoard[i][4 - i].equals(unknown)) {
				flagYX = false;
			}
		}
		if (flagXY) {
			for (int i = 0; i < 5; i++) {
				if (!hideBoard[i][i].equals(bingo)) {
					hideBoard[i][i] = bingo;
				}
			}
			bingoCnt++;
			flagXY = false;
		}
		if (flagYX) {
			for (int i = 0; i < 5; i++) {
				if (!hideBoard[i][4 - i].equals(bingo)) {
					hideBoard[i][4 - i] = bingo;
				}
			}
			bingoCnt++;
			flagYX = false;
		}
		p.setHideBoard(hideBoard);
		p.setBingoCnt(bingoCnt);
		return p;
	}
}
