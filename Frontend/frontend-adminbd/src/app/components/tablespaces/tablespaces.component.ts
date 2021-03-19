import { Component, OnInit } from '@angular/core';
import { Tablespace } from 'src/app/common/tablespace';
import { TablespacesService } from 'src/app/services/tablespaces/tablespaces.service';

@Component({
  selector: 'app-tablespaces',
  templateUrl: './tablespaces.component.html',
  styleUrls: ['./tablespaces.component.css']
})
export class TablespacesComponent implements OnInit {
 
  tablespaces : Tablespace [] = []

  constructor(private tablespacesService: TablespacesService) { }

  ngOnInit(): void {
    this.handlerTablespaces();
  }

  handlerTablespaces(){
    this.tablespacesService.getTablespaces().subscribe(
      response => {
        this.tablespaces = response
      }
    );
  }

}
