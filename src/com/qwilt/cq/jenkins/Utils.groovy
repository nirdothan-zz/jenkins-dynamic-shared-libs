package com.qwilt.cq.jenkins
class Utils implements Serializable {
  
  def steps
  def buildScript
  
  Utils(steps) {this.steps = steps}
  def setBuildScript(String script){
    this.buildScript=script
  }

  

   def shell(){  
     steps.sh  "sh ${this.buildScript}"
  }
  

  
  def direct(){  
    steps.sh  this.buildScript
  }
  
  
  
  
}
