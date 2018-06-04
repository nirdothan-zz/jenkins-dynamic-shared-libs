package com.qwilt.cq.jenkins
class Utils implements Serializable {
  
  def steps
  def buildScript
  
  Utils(steps) {this.steps = steps}
  def setBuildScript(script){
    this.buildScript=script
  }

  

  
   def func2(args) {
     steps.sh "echo ${args}"
    }
  
  def func3(){
    
    steps.sh  this.buildStr
  }
  
  
  
  
}
