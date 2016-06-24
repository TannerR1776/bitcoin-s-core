package org.bitcoins.core.protocol.transaction

import org.scalacheck.{Prop, Properties}

/**
  * Created by chris on 6/24/16.
  */
class TransactionOutputSpec extends Properties("TransactionOutputSpec") {

  property("Serialization symmetry") =
    Prop.forAll(TransactionGenerators.outputs) { output =>
      TransactionOutput(output.hex) == output
      output.hex == TransactionOutput(output.hex).hex
    }
}
