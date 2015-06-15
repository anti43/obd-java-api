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
package pt.lighthouselabs.obd.exceptions;

import java.util.HashSet;
import java.util.Set;

/**
 * Thrown when there is a "7F 01 12" message.
 */
public class UnsupportedCommandException extends ObdResponseException {

  public static Set<String> knownCommands = new HashSet<String>();

  public UnsupportedCommandException() {
    super("7F 01 12");
  }

}
