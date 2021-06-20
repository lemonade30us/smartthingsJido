/**
 *  Virtual stock
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
    definition (name: "Virtual Stock", namespace: "jido1517", author: "jido1517", ocfDeviceType: "", mnmn: "SmartThingsCommunity", vid: "2dd229fb-d2a8-3798-9722-866ec5f20285") {
        capability "trustsmile56703.stockstatus"
        capability "trustsmile56703.stocknow"
        capability "trustsmile56703.stockyesterday"
        capability "trustsmile56703.stockreturn"
        capability "trustsmile56703.stockrate"
        capability "Sensor"
    }
}
def setStockstatus(data0){
    sendEvent(name: "stockstatus", value: data0)
}
def setStocknow(data1){
    sendEvent(name: "stocknow", value: data1)
}
def setStockyesterday(data2){
    sendEvent(name: "stockyesterday", value: data2)
}
def setStockreturn(data3){
    sendEvent(name: "stockreturn", value: data3)
}
def setStockrate(data4){
    sendEvent(name: "stockrate", value: data4)
}