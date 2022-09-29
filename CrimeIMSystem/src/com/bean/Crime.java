package com.bean;

import java.time.LocalDate;

public class Crime {
	

		private LocalDate date;
		private String description;
		private String detailDescription;
		private int areaId;
		private int policeStationId;
		private String status;
		
		public Crime() {
			
		}

		public Crime(LocalDate date, String description, String detailDescription, int areaId, int policeStationId,
				String status) {
			super();
			this.date = date;
			this.description = description;
			this.detailDescription = detailDescription;
			this.areaId = areaId;
			this.policeStationId = policeStationId;
			this.status = status;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDetailDescription() {
			return detailDescription;
		}

		public void setDetailDescription(String detailDescription) {
			this.detailDescription = detailDescription;
		}

		public int getAreaId() {
			return areaId;
		}

		public void setAreaId(int areaId) {
			this.areaId = areaId;
		}

		public int getPoliceStationId() {
			return policeStationId;
		}

		public void setPoliceStationId(int policeStationId) {
			this.policeStationId = policeStationId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Crime [date=" + date + ", description=" + description + ", detailDescription=" + detailDescription
					+ ", areaId=" + areaId + ", policeStationId=" + policeStationId + ", status=" + status + "]";
		}
		
	


}
