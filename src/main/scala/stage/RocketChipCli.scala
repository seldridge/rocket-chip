// See LICENSE.SiFive for license details.

package freechips.rocketchip.stage

import firrtl.options.Shell

trait RocketChipCli { this: Shell =>

  parser.note("Rocket Chip Compiler Options")
  Seq( TopModuleAnnotation,
       ConfigAnnotation )
    .foreach(_.addOptions(parser))

}
