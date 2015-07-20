/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Calculated Engine Load value.
 */
public class EngineLoadObdCommand extends PercentageObdCommand {

  public EngineLoadObdCommand() {
    super("01 04");
  }

  /**
   * <p>Constructor for EngineLoadObdCommand.</p>
   *
   * @param other a {@link com.github.pires.obd.commands.engine.EngineLoadObdCommand} object.
   */
  public EngineLoadObdCommand(EngineLoadObdCommand other) {
    super(other);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.github.pires.obd.commands.ObdCommand#getName()
   */
  @Override
  public String getName() {
    return AvailableCommandNames.ENGINE_LOAD.getValue();
  }

}