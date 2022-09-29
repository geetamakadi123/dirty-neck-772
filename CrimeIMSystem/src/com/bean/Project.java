package com.bean;

public class Project {
	
	private String name;
	private int age;
	private String gender;
	private String address;
	private String mark;
	private int policeStationFirstArrested;
	
		public Project() {
			// TODO Auto-generated constructor stub
		}
		
		public Project(String name, int age, String gender, String address, String mark, int policeStationFirstArrested) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.address = address;
			this.mark = mark;
			this.policeStationFirstArrested = policeStationFirstArrested;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMark() {
			return mark;
		}

		public void setMark(String mark) {
			this.mark = mark;
		}

		public int getPoliceStationFirstArrested() {
			return policeStationFirstArrested;
		}

		public void setPoliceStationFirstArrested(int policeStationFirstArrested) {
			this.policeStationFirstArrested = policeStationFirstArrested;
		}

		@Override
		public String toString() {
			return "Criminal [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", mark="
					+ mark + ", policeStationFirstArrested=" + policeStationFirstArrested + "]";
		}
		
		
	


}
