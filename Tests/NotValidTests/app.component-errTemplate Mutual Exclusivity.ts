import { Component } from '@angular/core';
import { Router, RouterLink, RouterModule, RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { KeyValuePipe, NgFor, NgIf, NgTemplateOutlet } from '@angular/common';
import { routes } from './app.routes';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, RouterModule, NgFor, NgIf],
   template: '<p>Hello from inline template!</p>',///////Here
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  title = 'ang18';
  let X = 5 + 5;
  const Y = 'f';
  products = [
    { id: 1, name: 'MacBook M3', description: 'Model 2024', price: 1800, image: 'shortened-image-url' },
    { id: 2, name: 'Lenevo Legion 6', description: 'Model 2025', price: 1550, image: 'shortened-image-url' },
    { id: 3, name: 'Asus Rog strix', description: 'Model 2023', price: 1400, image: 'shortened-image-url' },
  ];

 selectedProduct: any = null;
  selectProduct(product: any) {
    this.selectedProduct = product;
  }

}

}

