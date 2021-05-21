/**
 *  Virtual Text
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
    definition (name: "Virtual Text", namespace: "jido1517", author: "jido1517", ocfDeviceType: "", mnmn: "SmartThingsCommunity", vid: "2410ef25-763a-36dc-a36f-54210933d57e") {
        capability "trustsmile56703.text"
        capability "Sensor"
    }
}
def setText(data0){
    sendEvent(name: "text", value: data0)
}
