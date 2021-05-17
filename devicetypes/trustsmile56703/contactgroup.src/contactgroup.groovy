metadata {
 	definition (name: "ContactGroup", namespace: "trustsmile56703", author: "trustsmile56703", ocfDeviceType: "", mnmn: "SmartThingsCommunity", vid: "5342a62c-cd68-39b0-b2a1-28c9b6ad4db4") {
		capability "Contact Sensor"
        capability "Switch"
		capability "trustsmile56703.text"
        capability "Actuator"
        capability "Sensor"
		command "open"
		command "close"
    }
 }
def setText(param1){
    sendEvent(name: "text", value: param1)
}
def open() {
	sendEvent(name: "contact", value: "open")
}
def close() {
    sendEvent(name: "contact", value: "closed")
}
def on() {
	sendEvent(name: "switch", value: "on")
	sendEvent(name: "contact", value: "open")
}
def off() {
	sendEvent(name: "switch", value: "off")
    sendEvent(name: "contact", value: "closed")
}
def installed() {
    on()
}