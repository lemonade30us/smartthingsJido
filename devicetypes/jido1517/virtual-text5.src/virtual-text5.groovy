/**
 *  Virtual Text5
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
    definition (name: "Virtual Text5", namespace: "jido1517", author: "jido1517", ocfDeviceType: "", mnmn: "SmartThingsCommunity", vid: "d43c0084-d2d3-34b6-97b4-27aec6b15115") {
        capability "trustsmile56703.texta"
        capability "trustsmile56703.textb"
        capability "trustsmile56703.textc"
        capability "trustsmile56703.textd"
        capability "trustsmile56703.texte"
        capability "Sensor"
    }
}
def setTexta(data0){
    sendEvent(name: "texta", value: data0)
}
def setTextb(data1){
    sendEvent(name: "textb", value: data1)
}
def setTextc(data2){
    sendEvent(name: "textc", value: data2)
}
def setTextd(data3){
    sendEvent(name: "textd", value: data3)
}
def setTexte(data4){
    sendEvent(name: "texte", value: data4)
}