/*
 * Copyright 2010 LinkedIn
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kafka.zk

import kafka.utils.TestUtils
import org.scalatest.junit.JUnitSuite
import org.junit.{After, Before}

trait ZooKeeperTestHarness extends JUnitSuite {
  val zkConnect: String
  var zookeeper: EmbeddedZookeeper = null

  @Before
  def setUp() {
    println("Starting up zookeeper at " + zkConnect)
    zookeeper = new EmbeddedZookeeper(zkConnect)
  }

  @After
  def tearDown() {
    println("Shutting down zookeeper at " + zkConnect)
    zookeeper.shutdown()
  }

}
