window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ConverterData = window.blockly.js.blockly.ConverterData || {};

/**
 * converterData
 */
window.blockly.js.blockly.ConverterData.Executar = function(datafinal) {
 var item, x;
  item = this.cronapi.conversion.stringToDate(datafinal);
  this.cronapi.screen.changeValueOfField("Prazo.active.datafinal", item);
}
