package com.academix.application.views.dashboard;

import com.academix.application.views.MainLayout;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
@PageTitle("Dashboard")
@Route(value = "dashboard", layout = MainLayout.class)
public class DashboardView extends VerticalLayout{
    public DashboardView(){
        add(new H1("Bienvenue dans AcademiX"));
        Grid<String> grid = new Grid<>();
        grid.setItems("nom", "Prenom", "date de naissance", "adresse", "email", "telephone", "classe", "niveau", "matiere", "salle", "horaire", "professeur", "cours", "devoir", "note", "absence");
        grid.addColumn(item -> item).setHeader("Items");
        HorizontalLayout layout = new HorizontalLayout();
        layout.setSpacing(true);
        layout.setPadding(true);
        layout.setSizeFull();
        layout.add(grid);
        add(layout);
        Chart chart = new Chart();
        chart.getConfiguration().setTitle("AcademiX");

        add(chart);
    }


}
