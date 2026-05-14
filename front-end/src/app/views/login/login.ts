import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.scss',
})
export class Login {
  protected readonly username = signal('');
  protected readonly password = signal('');
  protected readonly errorMessage = signal('');

  constructor(private readonly router: Router) {}

  onUsernameChange(value: string): void {
    this.username.set(value);
  }

  onPasswordChange(value: string): void {
    this.password.set(value);
  }

  onSubmit(): void {
    if (!this.username() || !this.password()) {
      this.errorMessage.set('Please enter username and password');
      return;
    }
    this.errorMessage.set('');
    this.router.navigate(['/home']);
  }
}
