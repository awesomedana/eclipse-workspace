﻿package hash.service;

import java.util.HashMap;
import java.util.Scanner;

public class HashUI {
	Scanner input = new Scanner(System.in);
	FoodService fService = new FoodService();
	
	public HashUI() {
		while (true) {
			printMainMenu();
			int select = input.nextInt();
			switch (select) {
			case 1:
				this.insert();
				break;
			case 2:
				this.search();
				break;
			case 3:
				this.update();
				break;
			case 4:
				this.delete();
				break;
			default:
				System.out.println("잘보고 골라라!!!!!!!!!");
				break;
			}
		}
	}
	
	public void printMainMenu() {
		System.out.println("===== 해쉬맵 연습 =====");
		System.out.println("1. 입력");
		System.out.println("2. 검색");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("===================");
		System.out.print("선택 => ");
	}
	
	private void insert() {
		System.out.println("----- 입력 -----");
		System.out.print("음식코드 : ");
		String fcode = input.next();
		System.out.print("음식이름 : ");
		String fname = input.next();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(fcode, fname);
		int result = fService.insert(map);
		if (result == 1) {
			System.out.println("등록되었습니다.");
		} else if (result == 0) {
			System.out.println("등록에 실패했습니다.");
		}
	}
	
	private void search() {
		// TODO Auto-generated method stub
		
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}
	
	private void delete() {
		// TODO Auto-generated method stub
		
	}

}
