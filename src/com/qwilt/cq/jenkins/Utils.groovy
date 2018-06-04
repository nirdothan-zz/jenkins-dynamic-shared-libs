package com.qwilt.cq.jenkins
class Utils implements Serializable {
  def steps
  Utils(steps) {this.steps = steps}
  def echo(args) {
    steps.sh "echo 'hello NIRNIRNIR'"
  }
  
  
   def func2(args) {
     steps.sh "echo ${args}"
    }
  
  def func3(nyfunc){
    
    myfunc() 
  }
  
  
  
  
}
