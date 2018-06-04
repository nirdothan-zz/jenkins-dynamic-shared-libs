package com.qwilt.cq.jenkins
class Utils implements Serializable {
  
  def steps
  
  Utils(steps) {this.steps = steps}
  def setBuild(buildStr){
    this.buildStr=buildStr
  }
  

  
   def func2(args) {
     steps.sh "echo ${args}"
    }
  
  def func3(){
    
    steps.sh  this.buildStr
  }
  
  
  
  
}
