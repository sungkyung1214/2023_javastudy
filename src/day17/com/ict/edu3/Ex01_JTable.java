package day17.com.ict.edu3;

import javax.swing.table.AbstractTableModel;

// 테이블을 만들기 위해서는 AbstractTableModel 상속받자
public class Ex01_JTable extends AbstractTableModel {

	// 1. 컬럼명( 열의 대표적인 이름)를 배열로 만든다.
	String[] name = { "번호", "아이디", "패스워드", "나이", "성별" };

	String[][] data = { 
			{ "1", "aaaa", "a111", "12", "true" }, 
			{ "2", "bbbb", "b111", "15", "falese" },
			{ "3", "cccc", "c111", "18", "true" }, 
			{ "4", "dddd", "d111", "10", "false" },

	};

	// 행의 수 = rows = 줄
	@Override
	public int getRowCount() {
		return data.length;
	}

	// 열의 수 = Column = 칸
	@Override
	public int getColumnCount() {
		return name.length;
	}

	// 내용 삽입
	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];

	}
	
	// 컬러명 붙이기
	@Override
	public String getColumnName(int column) {
		return name[column];
	}
	
	// 내용 수정 셋또셋토
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		//boolean 형에서 is 는 set이다.
		if(columnIndex !=0) {
			return true;
		}else {
			return false;
		}
	}
	
	// 고친 내용 적용하기 셋또셋또
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// aValue = 변경된 값
		if(columnIndex !=0) {
		data[rowIndex][columnIndex]= (String)aValue;
	}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

