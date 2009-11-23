application(title:'Mortgage Calculatr', pack:true, locationByPlatform:true) {
  panel(border: emptyBorder(6)) {
    
    gridLayout(rows:4, columns:2, hgap:6, vgap:6)

    label('Principal:')
    textField(text: bind(target:model, 'principal',
      value:'$200,000',
      validator: controller.validatePrincipal,
      converter: controller.convertPrincipal))

    label('Interest Rate:')
    textField(text: bind(target:model, 'monthlyRate',
      value:'6.5%',
      validator: controller.validateRate,
      converter: controller.convertRate))

    label('Term:')
    textField(text: bind(target:model, 'months',
      value:'30',
      validator: controller.validateTerm,
      converter: controller.convertTerm))

    label('Monthly Payment (P&I):')
    textField(editable:false,
      text: bind(source: model, sourceProperty: 'payment',
        sourceEvent: 'propertyChange',
        converter: controller.convertPayment))
  }
}