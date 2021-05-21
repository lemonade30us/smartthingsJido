/**
 *  Virtual ContactGroup
 *
 *  Copyright 2017,2021 SmartThings / jido1517 
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *	  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
 
metadata {
 	definition (name: "Virtual ContactGroup", namespace: "jido1517", author: "jido1517", ocfDeviceType: "", mnmn: "SmartThingsCommunity", vid: "5342a62c-cd68-39b0-b2a1-28c9b6ad4db4") {
		capability "Contact Sensor"
        capability "Switch"
		capability "trustsmile56703.text"
        capability "Actuator"
        capability "Sensor"
		command "open"
		command "close"
    }
 }
def setText(data1){
    sendEvent(name: "text", value: data1)
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