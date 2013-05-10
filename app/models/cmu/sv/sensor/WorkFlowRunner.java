package models.cmu.sv.sensor;


public class WorkFlowRunner {
		private String virtualDeviceID;
		private String topic;
		private MessageBusHandler handler;
		
		public WorkFlowRunner(String virtualDeviceID, String topic){
			this.virtualDeviceID = virtualDeviceID;
			this.topic = topic;
			this.handler = new MessageBusHandler();
		}
		
		public boolean notifyVirtualDevice(int value){
			return handler.publishToListener(this.topic, this.virtualDeviceID, value);
		}
		
}