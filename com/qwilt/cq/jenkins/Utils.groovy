package com.qwilt.cq.jenkins
class Utils implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def echo(args) {
    steps.sh "echo 'hello NIRNIRNIR'"
  }
}
