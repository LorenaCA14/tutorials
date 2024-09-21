package com.baeldung.web.controller;

import com.baeldung.model.Employee;
import com.baeldung.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class InvoiceController {

    Map<Long, Invoice> invoiceMap = new HashMap<>();

    @ModelAttribute("invoices")

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("invoiceHome", "invoice", new Invoice());
    }

    @RequestMapping(value = "/invoice/{Id}", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
    public @ResponseBody Invoice getInvoiceById(@PathVariable final Long Id) {
        return invoiceMap.get(Id);
    }

    @RequestMapping(value = "/addInvoice", method = RequestMethod.POST)
    public String submit(@ModelAttribute("invoice") final Invoice invoice, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("concepto", invoice.getConcepto());
        model.addAttribute("cantidad", invoice.getCantidad());
        model.addAttribute("porcentajeRetencion", invoice.getPorcentajeRetencion());
        model.addAttribute("id", invoice.getId());

        invoiceMap.put(invoice.getId(), invoice);

        return "invoiceView";
    }
}


